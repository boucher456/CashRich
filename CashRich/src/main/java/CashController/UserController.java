package CashController;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CashModel.User;
import CashService.UserService;

@RestController
@RequestMapping("/api/users")
@Validated
public class UserController {   @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<User> signUp(@Validated @RequestBody User user) {
        User savedUser = userService.saveUser(user);
        return ResponseEntity.ok(savedUser);
    }

    @PutMapping("/update")
    public ResponseEntity<User> updateUser(Principal principal, @Validated @RequestBody User user) {
        User existingUser = userService.getUserByUsername(principal.getName());
        User updatedUser = userService.updateUser(existingUser.getId(), user);
        return ResponseEntity.ok(updatedUser);
    }
    }
