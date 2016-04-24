package service;

import com.malex.model.RolesEntity;
import com.malex.model.enums.Role;
import com.malex.service.RolesService;
import configuration.BaseConfigTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

public class RolesServiceImplTest extends BaseConfigTest {

    @Autowired
    private RolesService service;

    /**
     TEST:
     1. RolesEntity save(RolesEntity entity);
     2. RolesEntity update(RolesEntity entity);
     3. void delete(Long id);
     4. RolesEntity findById(Long id);
     5. List<RolesEntity> findAll();
     */

    /**
     * TEST:
     * 1. RolesEntity save(RolesEntity entity);
     */
    @Test
    @Rollback
    public void test_save() {
        // given
        RolesEntity entity = new RolesEntity();
        entity.setRole(Role.ADMIN);

        // when
        RolesEntity actualEntity = service.save(entity);

        //then
        assertNotNull(actualEntity);
        assertEquals(entity, actualEntity);
    }

    /**
     * TEST:
     * 2. RolesEntity update(RolesEntity entity);
     */
    @Test
    @Rollback
    public void test_update() {
        // given
        RolesEntity entity = new RolesEntity();
        entity.setRole(Role.ADMIN);
        RolesEntity expectEntity = service.save(entity);

        // when
        expectEntity.setRole(Role.USER);
        RolesEntity actualEntity = service.save(expectEntity);

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
        RolesEntity entity = new RolesEntity();
        entity.setRole(Role.ADMIN);
        service.save(entity);

        // when
        service.delete(entity.getId());

        //then
        assertTrue(service.findAll().isEmpty());
    }

    /**
     * TEST:
     * 4. RolesEntity findById(Long id);
     */
    @Test
    @Rollback
    public void test_findById() {
        // given
        RolesEntity entity = new RolesEntity();
        entity.setRole(Role.ADMIN);
        RolesEntity expectEntity = service.save(entity);

        // when
        RolesEntity actualEntity = service.findById(expectEntity.getId());

        //then
        assertNotNull(actualEntity);
        assertEquals(expectEntity, actualEntity);
    }

    /**
     * TEST:
     * 5. RolesEntity findAll(Long id);
     */
    @Test
    @Rollback
    public void test_finAll() {
        List<RolesEntity> expectList = new ArrayList<>();

        // given
        for (int i = 0; i < 5; i++) {
            RolesEntity entity = new RolesEntity();
            entity.setRole(Role.ADMIN);
            expectList.add(entity);
            service.save(entity);
        }
        // when
        List<RolesEntity> actualList = service.findAll();

        //then
        assertNotNull(actualList);
        assertTrue(!service.findAll().isEmpty());
        assertEquals(expectList, actualList);
    }

}
