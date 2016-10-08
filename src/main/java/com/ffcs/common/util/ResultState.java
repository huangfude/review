package com.ffcs.common.util;

/**
 * Created by Administrator on 2016/10/04.
 */
public class ResultState
{
    public final int state;
    public final String messge;

    public ResultState(int state, String message)
    {
        this.state = state;
        this.messge = message;
    }
}