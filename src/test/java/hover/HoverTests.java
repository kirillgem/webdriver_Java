package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1(){
        HoversPage hoverPage = homePage.clickHovers();
        HoversPage.FigureCaption caption = hoverPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption title is not correct");
        assertEquals(caption.getLinkText(), "View profile", "Caption link text is not correct");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }
}
