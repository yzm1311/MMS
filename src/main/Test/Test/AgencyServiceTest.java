package Test ;

import mms.pojo.Agency;
import mms.services.AgencyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/*.xml"})
@Transactional
public class AgencyServiceTest {
    @Autowired
    private AgencyService agencyService;
    @Test
    public void queryAgencyByAno() throws Exception {
        Agency agency = agencyService.queryAgencyByAno("26607398");
        if (("").equals(agency)) {
            System.out.print("ni s ");
        } else {
            System.out.print(agency.toString());
        }
    }

}