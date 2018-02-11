package cn.codeforfun.serviceuser;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangbin
 */
@RestController
public class UserController {
  @Resource
  private UserDao userDao;

  @GetMapping("/findAll")
  public ResponseEntity findAll() {
    return ResponseEntity.ok(userDao.findAll());
  }
}
