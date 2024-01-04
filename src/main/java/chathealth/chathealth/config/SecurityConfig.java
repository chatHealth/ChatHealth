package chathealth.chathealth.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@RequiredArgsConstructor
public class SecurityConfig {
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests((auth)->auth
                        .requestMatchers("/","/auth/join","/auth/login","/css/**","/js/**","/board","/board/{id}")
                        .permitAll()
                        .anyRequest()
                        .authenticated())
                .formLogin((form)->form
                        .loginPage("/auth/login")   // get
                        .usernameParameter("email")
                        .passwordParameter("pw")
                        .loginProcessingUrl("/auth/login")  //post
                        .defaultSuccessUrl("/",true)
                        .permitAll()
                )
                /*.oauth2Login((ouath2Login) -> ouath2Login
                        .loginPage("/auth/login")
                        .defaultSuccessUrl("/")
                        .userInfoEndpoint((userInfo) -> userInfo
                                .userService(oAuth2DetailsService)
                        )
                )*/
                .csrf((csrf)->  csrf.disable());

        return httpSecurity.build();
    }
}