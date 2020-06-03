package com.example.demo.service;

import com.example.demo.entity.repository.PhoneCode;

import java.util.Optional;

public interface IAuthService {
	Optional<Integer> insert(PhoneCode phoneCode);
}