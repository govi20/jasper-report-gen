package crawler;

/**
 * @author:Govinda<govinda@cdac.in>
 * Date:03-Nov-2015
 * Credits : http://www.netinstructions.com/how-to-make-a-simple-web-crawler-in-java/
 */

public class SpiderTest
{
    /**
     * This is our test. It creates a spider (which creates spider legs) and crawls the web.
     * 
     * @param args
     *            - not used
     */
    public static void main(String[] args)
    {
        Spider spider = new Spider();
        spider.crawl("https://community.topcoder.com/tc?module=ProblemArchive&sr=1&er=5000&sc=&sd=&class=&cat=&div1l=&div2l=&mind1s=&mind2s=&maxd1s=&maxd2s=&wr=");
    }
}

