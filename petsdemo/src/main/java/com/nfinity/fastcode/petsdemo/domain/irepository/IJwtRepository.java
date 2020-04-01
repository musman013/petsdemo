package com.nfinity.fastcode.petsdemo.domain.irepository; 
 
import com.nfinity.fastcode.petsdemo.domain.model.JwtEntity; 
import org.springframework.data.jpa.repository.JpaRepository; 
 
import java.util.List; 

public interface IJwtRepository extends JpaRepository<JwtEntity, Long> { 

    JwtEntity findByToken(String token); 
    
} 