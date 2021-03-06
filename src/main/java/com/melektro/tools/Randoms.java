/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.melektro.tools;

import java.util.Random;
import java.util.UUID;

/**
 *
 * @author marius
 */
public class Randoms
{

    private static long GetSeed()
    {
        return Long.parseLong(UUID.randomUUID().toString().substring(0, 7), 16);
    }

    public static int GetRandomNumber(int max)
    {
        return new Random(GetSeed()).nextInt(max) + 1;
    }

    public static int GetRandomNumber(int max, int previousNumber)
    {
        long seed = GetSeed();
        if (previousNumber > 0)
        {
            seed = seed / previousNumber;
        }
        return new Random(seed).nextInt(max) + 1;
    }

    private static int GetRandomNumber(int max, long seed)
    {
        return new Random(seed).nextInt(max) + 1;
    }
}