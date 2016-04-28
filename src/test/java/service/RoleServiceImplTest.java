package service;

import com.malex.model.RoleEntity;
import com.malex.model.enums.Role;
import com.malex.service.RoleService;
import configuration.BaseConfigTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

public class RoleServiceImplTest extends BaseConfigTest {

    @Autowired
    private RoleService service;

    /**
     TEST:
     1. RoleEntity save(RoleEntity entity);
     2. RoleEntity update(RoleEntity entity);
     3. void delete(Long id);
     4. RoleEntity findById(Long id);
     5. List<RoleEntity> findAll();
     */

    /**
     * TEST:
     * 1. RoleEntity save(RoleEntity entity);
     */
    @Test
    @Rollback
    public void test_save() {
        // given
        RoleEntity entity = new RoleEntity();
        entity.setRole(Role.ADMIN);

        // when
        RoleEntity actualEntity = service.save(entity);

        //then
        assertNotNull(actualEntity);
        assertEquals(entity, actualEntity);
    }

    /**
     * TEST:
     * 2. RoleEntity update(RoleEntity entity);
     */
    @Test
    @Rollback
    public void test_update() {
        // given
        RoleEntity entity = new RoleEntity();
        entity.setRole(Role.ADMIN);
        RoleEntity expectEntity = service.save(entity);

        // when
        expectEntity.setRole(Role.USER);
        RoleEntity actualEntity = service.save(expectEntity);

        //then
        assertNotNull(actualEntity);
        assertEquals(expectEntity, actualEntity);
    }

    /**
     * TEST:
     * 3. void delete(Long id);
     */
    @Test
    @Rollback
    public void test_delete() {
        // given
        RoleEntity entity = new RoleEntity();
        entity.setRole(Role.ADMIN);
        service.save(entity);

        // when
        service.delete(entity.getId());

        //then
        assertTrue(service.findAll().isEmpty());
    }

    /**
     * TEST:
     * 4. RoleEntity findById(Long id);
     */
    @Test
    @Rollback
    public void test_findById() {
        // given
        RoleEntity entity = new RoleEntity();
        entity.setRole(Role.ADMIN);
        RoleEntity expectEntity = service.save(entity);

        // when
        RoleEntity actualEntity = service.findById(expectEntity.getId());

        //then
        assertNotNull(actualEntity);
        assertEquals(expectEntity, actualEntity);
    }

    /**
     * TEST:
     * 5. RoleEntity findAll(Long id);
     */
    @Test
    @Rollback
    public void test_finAll() {
        List<RoleEntity> expectList = new ArrayList<>();

        // given
        for (int i = 0; i < 5; i++) {
            RoleEntity entity = new RoleEntity();
            entity.setRole(Role.ADMIN);
            expectList.add(entity);
            service.save(entity);
        }
        // when
        List<RoleEntity> actualList = service.findAll();

        //then
        assertNotNull(actualList);
        assertTrue(!service.findAll().isEmpty());
        assertEquals(expectList, actualList);
    }

}
