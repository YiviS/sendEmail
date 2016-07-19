package com.service;

import com.tools.ServiceException;

import java.text.ParseException;

/**
 * Created by xuguang on 2016/7/6 ${time}.
 */
public interface IRegisterValidateService {

    public void processregister(String email);

    public void processActivate(String email , String validateCode) throws ServiceException, ParseException;
}
