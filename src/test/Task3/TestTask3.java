package test.Task3;

import org.junit.Test;

import static org.junit.Assert.*;
import main.Task3.*;


public class TestTask3 {

    @Test
    public void testBowOneTime() {
        Notebook notebook = new Notebook();
        Vogon vogon = new Vogon(30, "vogon");
        Captain captain = new Captain(50, "Captain", notebook);

        vogon.bow(captain);
        assertEquals(captain.getSatisfaction(), 10);
    }

    @Test
    public void testBowThreeTimes() {
        Notebook notebook = new Notebook();
        Vogon vogon = new Vogon(30, "vogon");
        Captain captain = new Captain(50, "Captain", notebook);

        vogon.bow(captain);
        vogon.bow(captain);
        vogon.bow(captain);
        assertEquals(captain.getSatisfaction(), 30);
    }

    @Test
    public void testGrabStronger() {
        Humanoid firstHumanoid = new Humanoid(10, "firstHumanoid");
        Humanoid secondHumanoid = new Humanoid(10, "secondHumanoid");
        Vogon vogon = new Vogon(40, "vogon");

        assertTrue(vogon.grab(firstHumanoid, secondHumanoid));
    }

    @Test
    public void testGrabEqual() {
        Humanoid firstHumanoid = new Humanoid(10, "firstHumanoid");
        Humanoid secondHumanoid = new Humanoid(10, "secondHumanoid");
        Vogon vogon = new Vogon(20, "vogon");

        assertFalse(vogon.grab(firstHumanoid, secondHumanoid));
    }

    @Test
    public void testGrabWeaker() {
        Humanoid firstHumanoid = new Humanoid(10, "firstHumanoid");
        Humanoid secondHumanoid = new Humanoid(10, "secondHumanoid");
        Vogon vogon = new Vogon(10, "vogon");

        assertFalse(vogon.grab(firstHumanoid, secondHumanoid));
    }

    @Test
    public void testOpeningWhenWasClosed() {
        SteelDoor steelDoor = new SteelDoor(false);

        steelDoor.open();
        assertTrue(steelDoor.isOpen());
    }

    @Test
    public void testOpeningWhenWasOpen() {
        SteelDoor steelDoor = new SteelDoor(true);

        assertThrows(IllegalStateException.class, steelDoor::open);
    }

    @Test
    public void testClosingWhenWasClosed() {
        SteelDoor steelDoor = new SteelDoor(false);

        assertThrows(IllegalStateException.class, steelDoor::close);
    }

    @Test
    public void testClosingWhenWasOpen() {
        SteelDoor steelDoor = new SteelDoor(true);

        steelDoor.close();
        assertFalse(steelDoor.isOpen());
    }

    @Test
    public void testScrollingOnePage() {
        Notebook notebook = new Notebook();
        Captain captain = new Captain(50, "Captain", notebook);

        captain.scrollNotebook(1);
        assertEquals(notebook.getCurrentPage(), 1);
    }

    @Test
    public void testScrollingTenPages() {
        Notebook notebook = new Notebook();
        Captain captain = new Captain(50, "Captain", notebook);

        captain.scrollNotebook(10);
        assertEquals(notebook.getCurrentPage(), 10);
    }

    @Test
    public void testScrollingThreeTimes() {
        Notebook notebook = new Notebook();
        Captain captain = new Captain(50, "Captain", notebook);

        captain.scrollNotebook(4);
        captain.scrollNotebook(4);
        captain.scrollNotebook(4);
        assertEquals(notebook.getCurrentPage(), 12);
    }

    @Test
    public void testPurrOneTime() {
        Notebook notebook = new Notebook();
        Captain captain = new Captain(50, "Captain", notebook);

        captain.purr();
        assertEquals(captain.getSatisfaction(), 5);
    }

    @Test
    public void testPurrFourTimes() {
        Notebook notebook = new Notebook();
        Captain captain = new Captain(50, "Captain", notebook);

        captain.purr();
        captain.purr();
        captain.purr();
        captain.purr();
        assertEquals(captain.getSatisfaction(), 20);
    }

}
