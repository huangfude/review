package com.ffcs.common.superpage;

import java.util.List;

/**
 * Created by Administrator on 2016/10/03.
 */
public  interface MapperSuper {

    int countByExample(CriteriaSuper paramCriteriaSuper);

    List<BeanSuper> selectByExample(CriteriaSuper paramCriteriaSuper);
}
