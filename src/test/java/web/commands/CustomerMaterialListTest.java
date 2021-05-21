package web.commands;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.mockrunner.mock.web.WebMockObjectFactory;
import com.mockrunner.servlet.ServletTestModule;

import static org.junit.jupiter.api.Assertions.*;

class CustomerMaterialListTest {
    private ServletTestModule tester;
    private WebMockObjectFactory factory;

    @BeforeEach
    void setUp() {
        factory = new WebMockObjectFactory();
        tester = new ServletTestModule(factory);
    }

    @Test
    void execute() {
    }
}