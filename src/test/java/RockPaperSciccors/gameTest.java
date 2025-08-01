package RockPaperSciccors;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class gameTest {

    @Test
    public void rockReturnOne() {
        var rock = new rock();
        assertEquals(1,rock.compare(1));
    }
    @Test
    public void rockReturnMinusOne(){
        var rock = new rock();
        assertEquals(-1,rock.compare(0));
    }
    @Test
    public void rockReturnZero(){
        var rock = new rock();
        assertEquals(0,rock.compare(2));
    }
    @Test
    public void sciccorReturZero(){
        var sciccor = new sciccor();
        assertEquals(0,sciccor.compare(1));
    }
    @Test
    public void sciccorReturnOne(){
        var sciccor = new sciccor();
        assertEquals(1,sciccor.compare(0));
    }
    @Test
    public void sciccorReturnMinusOne(){
        var sciccor = new sciccor();
        assertEquals(-1,sciccor.compare(2));
    }
    @Test
    public void Zero(){
        var paper = new paper();
        assertEquals(0,paper.compare(0));
    }
    @Test
    public void paperReturnOne(){
        var paper = new paper();
        assertEquals(1,paper.compare(2));
    }
    @Test
    public void paperReturnMinusOne(){
        var paper = new paper();
        assertEquals(-1,paper.compare(1));
    }


}