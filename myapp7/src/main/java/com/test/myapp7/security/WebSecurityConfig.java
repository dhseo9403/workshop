package com.test.myapp7.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.core.userdetails.User;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

   @Bean 
   protected UserDetailsService userDetailsService() {
      UserDetails user = User.builder()
         .username("user")
         .password(passwordEncoder().encode("user123"))
         .build();
      return new InMemoryUserDetailsManager(user);
   }
    
    @Bean 
    protected PasswordEncoder passwordEncoder() { 
      return new BCryptPasswordEncoder(); 
    }
    
    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception { 
       return http
          .csrf(AbstractHttpConfigurer::disable)
          .authorizeHttpRequests(
             request -> request.requestMatchers("/login").permitAll()
             .requestMatchers("/**").authenticated()
          )
          .formLogin(form -> form.loginPage("/login")
             .defaultSuccessUrl("/")
             .failureUrl("/login?error=true")
             .permitAll())       
          .logout(config -> config  
          .logoutUrl("/logout") 
          .logoutSuccessUrl("/login")) 
          .build();
    }   
}