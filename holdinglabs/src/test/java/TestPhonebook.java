import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.TreeMap;

/**
 * Created by rahmirford on 5/16/17.
 */
public class TestPhonebook {
    String entryName;
    String expectedNumber;
    Phonebook phonebook;

    @Before
    public void setUp(){
        entryName = "Toprahmin";
        expectedNumber = "(302)-333-4444";
        phonebook = new Phonebook();
    }

    @Test
    public void testLookUpNumber(){
        //: Given
        phonebook.addContactInfo(entryName,expectedNumber);
        //: When
        String actualNumber = phonebook.lookUpNumber(entryName);
        //: Then
        Assert.assertEquals("the expected phone number is (302)-333-4444", expectedNumber,actualNumber);
    }

    @Test
    public void testAddContactInfoNumber(){
        //: Given
        phonebook.addContactInfo(entryName,expectedNumber);
        //: When
        String actualContactNumber = phonebook.getPhonebookMap().get(entryName);
        //: Then
        Assert.assertEquals("The expected contact number is (302)-333-4444", expectedNumber, actualContactNumber);
    }

    @Test
    public void testRemoveNumber(){
        //: Given

        //: When

        //: Then
    }

    @Test
    public void testListAllEntries(){
        //: Given

        //: When

        //: Then
    }




}
