package com.up_vams.upload.controller;

import com.aliyun.oss.OSSClient;
import com.up_vams.utils.OssUtils;
import com.up_vams.utils.constant.OssConstant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.io.PrintWriter;

@Controller
@RequestMapping("/upload")
public class UploadAction
{

    @RequestMapping("uploadPicture")
    public void uploadPicture(HttpServletRequest request, String fileName, PrintWriter out)
    {
        //把Request强转成多部件请求对象
        MultipartHttpServletRequest mh = (MultipartHttpServletRequest)request;
        //根据文件名称获取文件对象
        CommonsMultipartFile cm = (CommonsMultipartFile)mh.getFile(fileName);
        //得到文件流
        try
        {
            InputStream inputStream = cm.getInputStream();

            //文件名称在服务器有可能重复？
            //使用uuid
            //newFileName就是文件的主键，而且是oss的key的前缀，比如abc.jpg的abc
            String newFileName = OssUtils.generateKey();

            //获取文件扩展名
            String originalFilename = cm.getOriginalFilename();
            String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));

            //1创建oss的客户端
            OSSClient client = OssUtils.getClient();
            //2传送文件
            OssUtils.simpleFileUpload(newFileName + suffix, inputStream, client);
            //3关闭oss的客户端，上传完毕
            OssUtils.closeClient(client);


            //ajax回调函数需要会写些什么东西？
            //图片需要回显：需要图片完整路径
            //数据库保存图片的相对路径.
            //文件的原始名字
            String fullPath = OssConstant.ACCESS_URI + newFileName + suffix;

            //图片表中只存图片的id（同样就是图片的资源名字，此时没有后缀，后最可以从数据库中name中拿到）
            //String fileKey = newFileName;
            //{"":"","":""}
            String result = "{\"fullPath\":\"" + fullPath + "\",\"fileKey\":\"" + newFileName +"\",\"originalFilename\":\"" + originalFilename + "\"}";

            out.print(result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
