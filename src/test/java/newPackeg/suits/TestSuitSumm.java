package newPackeg.suits;

import org.junit.jupiter.api.Tag;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages(value = {"newPackeg.tests"})
@IncludeTags("summ")
@Tag("suit")
public class TestSuitSumm {

}