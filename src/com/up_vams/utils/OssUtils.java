package com.up_vams.utils;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.*;
import com.up_vams.utils.constant.OssConstant;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.UUID;

/**
 * Created by 隽 on 2017/1/25.
 */
public class OssUtils
{

    public static String bucketName = OssConstant.BUCKET_NAME;

    public static String endpoint = OssConstant.ENDPOINT;

    public static String accessKeyId = OssConstant.ACCESS_KEY;

    public static String accessKeySecret = OssConstant.ACCESS_KEY_SECRET;




    private static OSSClient client;

    /**
     * 得到一个客户端
     *
     * @return 一个客户端连接
     */
    public static OSSClient getClient()
    {
        return new OSSClient(endpoint, accessKeyId, accessKeySecret);
    }

    /**
     * 简单的文件上传
     *
     * @param fileName 原文件名
     * @param file   具体上传的文件
     */
    public static String simpleFileUpload(String fileName, File file, OSSClient client)
    {
        System.out.println("********************正在使用简单方式上传一个文件*******************\n");
        client.putObject(new PutObjectRequest(bucketName, fileName, file));
        System.out.println("********************上传结束******************************************");
        return fileName;
    }

    /**
     * 简单的文件上传
     *
     * @param fileName      原文件名
     * @param inputStream 具体上传的文件流
     */
    public static String simpleFileUpload(String fileName, InputStream inputStream, OSSClient client)
    {
        System.out.println("********************正在使用简单方式上传一个文件*********************\n");
        client.putObject(new PutObjectRequest(bucketName, fileName, inputStream));
        System.out.println("********************上传结束******************************************");
        return fileName;
    }

    /**
     * 简单的下载
     *
     * @param key 文件名
     */
    public static void simpleFiledownload(String key, OSSClient client)
    {
        System.out.println("正在用简单方式下载一个文件\n");

        OSSObject object = client.getObject(new GetObjectRequest(bucketName, key));
        System.out.println(object.getKey() + "\n" + object.getBucketName());
    }

    /**
     * 列举一个Bucket下的object
     */
    public static void listEveryObject(OSSClient client)
    {
        ObjectListing objectListing = client.listObjects(bucketName);
        for (OSSObjectSummary objectSummary : objectListing.getObjectSummaries())
        {
            System.out.println(" - " + objectSummary.getKey() + "  " +
                "(size = " + objectSummary.getSize() + ")");
        }

    }


    /**
     * @Description: 根据key获取oss服务器上的图片地址
     * @param key
     * @return
     * @ReturnType:String
     */
    public String getImgURl(String key,OSSClient client){
        Date expires = new Date(new Date().getTime() + 60*30*1000); // 30 minute to expire
        GeneratePresignedUrlRequest generatePresignedUrlRequest ;
        generatePresignedUrlRequest =new GeneratePresignedUrlRequest(bucketName, key);
        generatePresignedUrlRequest.setExpiration(expires);
        URL url = client.generatePresignedUrl(generatePresignedUrlRequest);
        return url.toString();
    }

    /**
     * 关闭客户端
     */
    public static void closeClient(OSSClient client)
    {
        client.shutdown();
    }

    public static String generateKey()
    {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static void main(String[] args)
    {
        OSSClient client = OssUtils.getClient();
        OssUtils.listEveryObject(client);
        client.shutdown();
    }
}
