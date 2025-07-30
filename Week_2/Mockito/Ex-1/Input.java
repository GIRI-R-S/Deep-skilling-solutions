package Mockito_exercise;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public interface Externalapi {
	 String getData();
}

public class Service {
    private Externalapi api;

    public Service(Externalapi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}


public class Servicetest {
	@Test
    public void testExternalApi() {
        Externalapi mockApi = mock(Externalapi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        Service service = new Service(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
        System.out.println("Result: " + result);
    }
}
