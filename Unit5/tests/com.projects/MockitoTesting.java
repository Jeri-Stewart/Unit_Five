
public class educationServiceTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private StudentDataObject studentDataObject;

    @Mock
    private InstructorDataObject instructorDataObject;

    @Mock
    private ClassDataObject classDataObject;

    @InjectMocks
    private ClientBusinessObjectImpl clientBusinessObjectImpl;

    ///

    @Test
    public void testStudentsByClass() {
        // Given
        Student studentJM = new Student(“Joy Ma”, “Spanish);
        Student student JH = new Student(“Julio Hernandez”, “Algebra”);
        Student student JJ = new Student(“Jenny Jones”, “Calculus”);
        List<Student> allStudents = Arrays.asList(studentJM, studentJH, studentJJ);

        given(studentDataObject.getAllStudents()).willReturn(allStudents);

        // When
        List<String> mathStudents = clientBusinessObjectImpl.getAllStudentsBySubject(“math”);

        // Then
        assertThat(mathStudents.size(), is(2));
        assertThat(mathStudents, hasItems(studentJJ, student JH);
    }

    ///

    @Test
    public void testMarkInactive() {

        // Given
        Class geometry = new Class(“Geometry”, “Summer 2022);
        Class envSci = new Class(“Environmental Science”, “Fall 2022”);
        Class compLit = new Class(“Comparative Literature”, “Spring 2023”);
        List<Class> allClasses = Arrays.asList(geometry, envSci, compLit);

        given(classDataObject.getAllClasses()).willReturn(allClasses);

        // When
        clientBusinessObjectImpl.markCurrentClassesInactive();

        // Then
        verify(classDataObject).markInactive(geometry);

        verify(classDataObject, Mockito.never()).markInactive(envSci);

        verify(classDataObject, Mockito.never()).markInactive(compLit);

        verify(classDataObject, Mockito.times(1)).markInactive(geometry);
        // atLeastOnce, atLeast

    }

    ///


// First: Setup

    @Captor
    ArgumentCaptor<Class> classArgumentCaptor;

// Next:

    @Test
    public void testMarkInactive_argumentCaptor() {
        // Given
        Class geometry = new Class(“Geometry”, “Summer 2022);
        Class envSci = new Class(“Environmental Science”, “Fall 2022”);
        Class compLit = new Class(“Comparative Literature”, “Spring 2023”);
        List<Class> allClasses = Arrays.asList(geometry, envSci, compLit);

        given(classDataObject.getAllClasses()).willReturn(allClasses);

        // When
        clientBusinessObjectImpl.markCurrentClassesInactive();

        // Then
        verify(classDataObject).markInactive(classArgumentCaptor.capture());

        assertEquals(geometry, classArgumentCaptor.getValue());
    }


    //Exploration

/*
import org.junit.Assert;
import org.junit.Test;

public class InstructorDataObjectTest {

    @Test
    public void testGetClassesByInstructor() {
        int instructorId = 123; // Provide a valid instructor ID for testing

        // Call the method to get the list of classes
        List<Class> classes = InstructorDataObject.getClassesByInstructor(instructorId);

        // Assert the expected result based on the instructor's classes
        Assert.assertEquals(expectedClasses, classes);
    }

    // Additional test cases can be added to cover different scenarios
}



public class ClassDataObjectTest {

    @Test
    public void testGetStudentsInClass() {
        int classId = 456; // Provide a valid class ID for testing

        // Call the method to get the list of students
        List<Student> students = ClassDataObject.getStudentsInClass(classId);

        // Assert the expected result based on the class's students
        Assert.assertEquals(expectedStudents, students);
    }

    // Additional test cases can be added to cover different scenarios
}
 */