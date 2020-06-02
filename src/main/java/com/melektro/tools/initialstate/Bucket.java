package com.melektro.tools.initialstate;

public class Bucket implements Events
{

    private final static String BUCKET_API_URL = API_BASEURL + "buckets";
    private String bucketKey;
    private String bucketName;

    public Bucket(String bucketKey)
    {
        this(bucketKey, null);
    }

    public Bucket(String bucketKey, String friendlyName)
    {
        this.bucketKey = bucketKey;
        this.bucketName = friendlyName;
    }

    public String getKey()
    {
        return bucketKey;
    }

    public String getFriendlyName()
    {
        return bucketName;
    }

    public String getEndpoint()
    {
        return BUCKET_API_URL;
    }
}
