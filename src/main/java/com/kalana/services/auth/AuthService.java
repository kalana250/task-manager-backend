package com.kalana.services.auth;

import com.kalana.dto.SignupRequest;
import com.kalana.dto.UserDto;

public interface AuthService {

    UserDto signupUser(SignupRequest signupRequest);

    boolean hasUserWithEmail(String email);

}
