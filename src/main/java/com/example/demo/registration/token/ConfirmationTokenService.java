package com.example.demo.registration.token;

import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ConfirmationTokenService {
    private final ConfirmationTokenRepository confirmationTokenRepository;

    public void saveConfirmationToken(ConfirmationToken token) {
        confirmationTokenRepository.save(token);
    }
}
