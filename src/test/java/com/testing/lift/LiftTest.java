package com.testing.lift;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LiftTest {

    @Before
    public void setUp() throws Exception {
        initMocks(this);
    }

    @Test
    public void weightMoreThanLimitShouldReturnStop() {

        String expected = "stop";

        Lift lift = new Lift();
        lift.setMaxWeight(1000);
        lift.setCurrentWeight(1200);
        lift.setFloor(10);
        lift.setTargetFloor(4);
        lift.setCurrentFloor(0);

        String control = lift.findLiftControl();
        assertTrue(expected.equals(control));
    }

    @Test
    public void weightNotMoreThanLimitAndFloorZeroToTopShouldReturnUp() {

        String expected = "up";

        Lift lift = new Lift();
        lift.setMaxWeight(1000);
        lift.setCurrentWeight(600);
        lift.setFloor(10);
        lift.setTargetFloor(10);
        lift.setCurrentFloor(0);

        String control = lift.findLiftControl();
        assertEquals(expected, control);
    }

    @Test
    public void weightNotMoreThanLimitAndFloorZeroToSemiTopShouldReturnUp() {

        String expected = "up";

        Lift lift = new Lift();
        lift.setMaxWeight(1000);
        lift.setCurrentWeight(600);
        lift.setFloor(10);
        lift.setTargetFloor(9);
        lift.setCurrentFloor(0);

        String control = lift.findLiftControl();
        assertEquals(expected, control);
    }

    @Test
    public void weightNotMoreThanLimitAndFloorZeroToOneShouldReturnUp() {

        String expected = "up";

        Lift lift = new Lift();
        lift.setMaxWeight(1000);
        lift.setCurrentWeight(600);
        lift.setFloor(10);
        lift.setTargetFloor(1);
        lift.setCurrentFloor(0);

        String control = lift.findLiftControl();
        assertEquals(expected, control);
    }

    @Test
    public void weightNotMoreThanLimitAndFloorZeroToZeroShouldReturnStop() {

        String expected = "stop";

        Lift lift = new Lift();
        lift.setMaxWeight(1000);
        lift.setCurrentWeight(600);
        lift.setFloor(10);
        lift.setTargetFloor(0);
        lift.setCurrentFloor(0);

        String control = lift.findLiftControl();
        assertEquals(expected, control);
    }

    @Test
    public void weightNotMoreThanLimitAndFloorTopToZeroShouldReturnDown() {

        String expected = "down";

        Lift lift = new Lift();
        lift.setMaxWeight(1000);
        lift.setCurrentWeight(600);
        lift.setFloor(10);
        lift.setTargetFloor(0);
        lift.setCurrentFloor(10);

        String control = lift.findLiftControl();
        assertEquals(expected, control);
    }

    @Test
    public void weightNotMoreThanLimitAndFloorTopToOneShouldReturnDown() {

        String expected = "down";

        Lift lift = new Lift();
        lift.setMaxWeight(1000);
        lift.setCurrentWeight(600);
        lift.setFloor(10);
        lift.setTargetFloor(1);
        lift.setCurrentFloor(10);

        String control = lift.findLiftControl();
        assertEquals(expected, control);
    }

    @Test
    public void weightNotMoreThanLimitAndFloorTopToSemiTopShouldReturnDown() {

        String expected = "down";

        Lift lift = new Lift();
        lift.setMaxWeight(1000);
        lift.setCurrentWeight(600);
        lift.setFloor(10);
        lift.setTargetFloor(9);
        lift.setCurrentFloor(10);

        String control = lift.findLiftControl();
        assertEquals(expected, control);
    }
}