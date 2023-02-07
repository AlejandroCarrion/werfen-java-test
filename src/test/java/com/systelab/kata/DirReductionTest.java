package com.systelab.kata;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DirReductionTest {
    @Test
    public void test1() {
        assertArrayEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",new String[]{"WEST"},
                DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
    }

    @Test
    public void test2() {
        assertArrayEquals("\"NORTH\",\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\"",
                new String[]{},
                DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"}));
    }
    
    @Test
    public void test3() {
        assertArrayEquals("\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\"",
                new String[]{"SOUTH"},
                DirReduction.dirReduc(new String[]{"SOUTH", "SOUTH", "EAST", "WEST", "NORTH"}));
    }
    
    @Test
    public void test4() {
        assertArrayEquals("\"NORTH\",\"NORTH\",\"EAST\",\"WEST\",\"SOUTH\"",
                new String[]{"NORTH"},
                DirReduction.dirReduc(new String[]{"NORTH", "NORTH", "EAST", "WEST", "SOUTH"}));
    }
    
    @Test
    public void test5() {
        assertArrayEquals("\"NORTH\",\"NORTH\",\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\"",
                new String[]{"NORTH"},
                DirReduction.dirReduc(new String[]{"NORTH", "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"}));
    }
}
