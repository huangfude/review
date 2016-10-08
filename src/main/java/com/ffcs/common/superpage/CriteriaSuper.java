package com.ffcs.common.superpage;

/**
 * Created by Administrator on 2016/10/03.
 */

public abstract interface CriteriaSuper
{
     void setTop(int paramInt);

    void setSkipCount(int paramInt);

    void setOrderByClause(String paramString);

    String getOrderByClause();
}