package CG.Washer.security.services;

import CG.Washer.models.WasherInfo;
import CG.Washer.repository.WasherInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private WasherInfoRepository washerInfoRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        WasherInfo washerInfo =washerInfoRepository.findByWasherEmail(email);
//        if(washerInfo== null) {
//            return new UsernameNotFoundException(email);
//        }
//        else {
        String username=washerInfo.getWasherEmail();
        String password=washerInfo.getWasherPassword();
        return new User(username, password, new ArrayList<>());
//        }
        //return new User("foo", "foo", new ArrayList<>());
    }
}

