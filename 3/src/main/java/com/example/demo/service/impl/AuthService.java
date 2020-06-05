package com.example.demo.service.impl;

import com.example.demo.config.AppConfigBean;
import com.example.demo.entity.repository.PhoneCode;
import com.example.demo.mapper.PhoneCodeMapper;
import com.example.demo.service.IAuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

/**
 * @project: demo
 * @packageName: com.example.demo.service.impl
 * @author: Administrator
 * @date: 2020/4/13 18:13
 * @description：TODO
 */

@Service
@Slf4j
public class AuthService implements IAuthService {
	@Autowired
	private PhoneCodeMapper phoneCodeMapper;

	@Autowired
	private AppConfigBean configBean;

	@Override
	public Optional<Integer> insert(PhoneCode phoneCode) {
		Date now = new Date();
		if (configBean.isDebugEnabled()) {
			log.debug("--------------->{}<---------------", now);
		}
		phoneCode.setCreateTime(new Date());
		int result = phoneCodeMapper.insert(phoneCode);
		return Optional.of(result);
	}
}
