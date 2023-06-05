import org.junit.Test;
import team.sdn.domain.Topology;
import team.sdn.sdnutils.TopologyUtils;

/**
 * @author Big-Bai
 **/
public class TopologyUtilsTest {
    @Test
    public void getTopologyTest(){
        System.out.println(TopologyUtils.getTopologyFromJson().toString());
    }

}
