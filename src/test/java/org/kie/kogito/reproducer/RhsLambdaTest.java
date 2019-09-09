package org.kie.kogito.reproducer;

import javax.inject.Inject;
import javax.inject.Named;

import org.junit.jupiter.api.Test;
import org.kie.kogito.reproducer.model.Person;
import org.kie.kogito.rules.RuleUnit;
import org.kie.kogito.rules.impl.SessionMemory;

import io.quarkus.test.junit.QuarkusTest;

/**
 * RhsLambdaTest
 */
@QuarkusTest
public class RhsLambdaTest {

    @Inject
    @Named("ruleUnitOne")
    RuleUnit<SessionMemory> ruleUnitOne;

    @Inject
    @Named("ruleUnitTwo")
    RuleUnit<SessionMemory> ruleUnitTwo;

    @Inject
    @Named("ruleUnitThree")
    RuleUnit<SessionMemory> ruleUnitThree;

    @Test
    public void testRuleUnitOne() { 
        SessionMemory sessionMemory = new SessionMemory();
        sessionMemory.add(new Person("Duncan", 40));
        ruleUnitOne.evaluate(sessionMemory);
    }

    @Test
    public void testRuleUnitTwo() { 
        SessionMemory sessionMemory = new SessionMemory();
        sessionMemory.add(new Person("Duncan", 40));
        ruleUnitTwo.evaluate(sessionMemory);
    }

    @Test
    public void testRuleUnitThree() { 
        SessionMemory sessionMemory = new SessionMemory();
        sessionMemory.add(new Person("Duncan", 40));
        ruleUnitThree.evaluate(sessionMemory);
    }
}