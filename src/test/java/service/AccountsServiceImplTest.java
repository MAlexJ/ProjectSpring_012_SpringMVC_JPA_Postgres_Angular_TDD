package service;

import com.malex.model.AccountsEntity;
import com.malex.model.RolesEntity;
import com.malex.model.enums.Role;
import com.malex.service.AccountsService;
import com.malex.service.RolesService;
import configuration.BaseConfigTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

public class AccountsServiceImplTest extends BaseConfigTest {

    @Autowired
    private AccountsService accountsService;

    @Autowired
    private RolesService rolesService;

    /**
     * TEST:
     * 1. AccountsEntity save(AccountsEntity entity);
     * 2. AccountsEntity update(AccountsEntity entity);
     * 3. void delete(Long id);
     * 4. AccountsEntity findById(Long id);
     * 5. List<AccountsEntity> findAll();
     */

    /**
     * TEST:
     * 1. AccountsEntity save(AccountsEntity entity);
     */
    @Test
    @Rollback
    public void test_save() {
        // given
        AccountsEntity entity = new AccountsEntity();
        entity.setDate(new Date());
        entity.setUserName("Adminka");
        entity.setPassword("26458sss");

        // when
        AccountsEntity actualEntity = accountsService.save(entity);

        //then
        assertNotNull(actualEntity);
        assertEquals(entity, actualEntity);
    }

    /**
     * TEST:
     * 1. AccountsEntity save(AccountsEntity entity);
     */
    @Test
    @Rollback
    public void test_save_with_roles() {
        // given
        AccountsEntity entity = new AccountsEntity();
        entity.setDate(new Date());
        entity.setUserName("Adminka");
        entity.setPassword("26458sss");
        AccountsEntity expectEntity = accountsService.save(entity);


        RolesEntity roleAdmin = new RolesEntity();
        roleAdmin.setRole(Role.ADMIN);
        roleAdmin.setAccount(expectEntity);

        RolesEntity roleUser = new RolesEntity();
        roleUser.setRole(Role.USER);
        roleUser.setAccount(expectEntity);

        // when
        AccountsEntity actualEntity = accountsService.findById(expectEntity.getId());

        System.err.println(actualEntity.getRoles());
        //then
        assertNotNull(actualEntity);
        assertEquals(expectEntity, actualEntity);
    }

    /**
     * TEST:
     * 2. AccountsEntity update(AccountsEntity entity);
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
     * 4. AccountsEntity findById(Long id);
     */
    @Test
    @Rollback
    public void test_findById() {
        // given


        // when


        //then

    }

    /**
     * TEST:
     * 5. List<AccountsEntity> findAll();
     */
    @Test
    @Rollback
    public void test_finAll() {

        // given

        // when


        //then


    }

}
