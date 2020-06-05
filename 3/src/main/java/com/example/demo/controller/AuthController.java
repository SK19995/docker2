package com.example.demo.controller;

import com.example.demo.entity.repository.PhoneCode;
import com.example.demo.service.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @project: demo
 * @packageName: com.example.demo.controller
 * @author: Administrator
 * @date: 2020/4/13 18:15
 * @description：TODO
 */

@RestController
@RequestMapping(value = "/auth")
public class AuthController {

	@Autowired
	private IAuthService authService;

	@PostMapping(value = "/signIn")
	public ResponseEntity signIn(@RequestBody PhoneCode phoneCode) {
		Optional<Integer> result = authService.insert(phoneCode);
		return ResponseEntity.of(result);
	}
}
