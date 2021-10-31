package by.epam.task02;

import by.epam.task02.service.impl.ApplianceServiceImplTest;
import by.epam.task02.service.validation.ValidatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * TestSuite class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
@Suite.SuiteClasses({ApplianceServiceImplTest.class, ValidatorTest.class})
@RunWith(Suite.class)
public class TestSuite {
}

