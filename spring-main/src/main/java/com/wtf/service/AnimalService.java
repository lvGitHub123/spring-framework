package com.wtf.service;

import com.wtf.po.Animal;
import com.wtf.po.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

	@Autowired
	private Animal animal;

}
