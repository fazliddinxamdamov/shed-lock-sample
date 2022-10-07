package com.example.shedlocksample;

import com.example.shedlocksample.component.RevenueReporter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class ShedLockSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShedLockSampleApplication.class, args);
	}
}
