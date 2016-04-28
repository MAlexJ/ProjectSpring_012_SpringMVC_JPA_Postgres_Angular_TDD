package service;

import com.malex.model.AccountEntity;
import com.malex.model.RoleEntity;
import com.malex.model.enums.Role;
import com.malex.service.AccountService;
import com.malex.service.RoleService;
import configuration.BaseConfigTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import java.util.Date;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class AccountServiceImplTest extends BaseConfigTest {

    @Autowired
    private AccountService accountsService;

    @Autowired
    private RoleService rolesService;

    /**
     * TEST:
     * 1. AccountEntity save(AccountEntity entity);
     * 2. AccountEntity update(AccountEntity entity);
     * 3. void delete(Long id);
     * 4. AccountEntity findById(Long id);
     * 5. List<AccountEntity> findAll();
     */

    /**
     * TEST:
     * 1. AccountEntity save(AccountEntity entity);
     */
    @Test
    @Rollback
    public void test_save() {
        // given
        AccountEntity entity = new AccountEntity();
        entity.setDate(new Date());
        entity.setUserName("Adminka");
        entity.setPassword("26458sss");

        // when
        AccountEntity actualEntity = accountsService.save(entity);

        //then
        assertNotNull(actualEntity);
        assertEquals(entity, actualEntity);
    }

    /**
     * TEST:
     * 1. AccountEntity save(AccountEntity entity);
     */
    @Test
    @Rollback(value = false)
    public void test_save_with_roles() {
        // given
        AccountEntity entity = new AccountEntity();
        entity.setDate(new Date());
        entity.setUserName("Adminka");
        entity.setPassword("26458sss");
        AccountEntity expectEntity = accountsService.save(entity);


        RoleEntity roleAdmin = new RoleEntity();
        roleAdmin.setRole(Role.ADMIN);
        roleAdmin.setAccount(expectEntity);
        rolesService.save(roleAdmin);

        RoleEntity roleUser = new RoleEntity();
        roleUser.setRole(Role.USER);
        roleUser.setAccount(expectEntity);
        rolesService.save(roleUser);

        // when
        AccountEntity actualEntity = accountsService.findById(expectEntity.getId());

        System.err.println(actualEntity);

        //then
        assertNotNull(actualEntity);
        assertEquals(expectEntity, actualEntity);
    }

    /**
     * TEST:
     * 2. AccountEntity update(AccountEntity entity);
     */
    @Test
    @Rollback
    public void test_update() {
        // given


        // when


        //then

    }

    /**
     * TEST:
     * 3. void delete(Long id);
     */
    @Test
    @Rollback
    public void test_delete() {
        // given


        // when


        //then

    }

    /**
     * TEST:
     * 4. AccountEntity findById(Long id);
     */
    @Test
    @Rollback
    public void test_findById() {
        // given

        System.err.println(accountsService.findById(7L));
        // when


        //then

    }

    /**
     * TEST:
     * 5. List<AccountEntity> findAll();
     */
    @Test
    @Rollback
    public void test_finAll() {

        // given

        // when


        //then


    }

    /**
     * TEST:
     * 6. List<AccountEntity> findAll();
     */
    @Test
    @Rollback
    public void test_findAccountWhereNameGt() {

        // given

        // when
        System.err.println(accountsService.findAccountWhereNameGt("alex","1111").getRoles().get(0).getRole().toString());

        //then


    }



}
