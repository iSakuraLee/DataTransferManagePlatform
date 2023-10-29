package com.onlee.dtmp.manage.controller;

import com.onlee.dtmp.manage.service.PublishSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/batch/publishSystem")
public class PublishSystemController {

    @Autowired
    private PublishSystemService publishSystemService;

}
