package com.vishwa.git_test;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Getter
@Setter
public class UserService {

    private String userName = "test";
    private int userId = 1;


}
