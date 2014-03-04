package com.trey.marvel.model.api.manager;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * Created by Trey Robinson on 2/16/14.
 *
 * Common functionality used by all service managers.
 */
public class BaseManager {

    /*
    *  Creates comma delimited string from list object
    * */
    public String parameterizeList(List<?> list){
       return StringUtils.join(list, ",");
    }
}
