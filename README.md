# ST10439826StaceyBabbage
**<u>ST10439826</u>**

**<u>IMAD ASSIGNMENT 1</u>**

YouTube Link: <https://youtu.be/pDTGrVlcPCs?si=5lLeReDWMyN_P21e>

1.  The app is designed for educational purposes; the idea came from an
    educator so that students can input ages and find out information
    about specific historical figures that died at that age. This app is
    meant for students to use so that they can learn facts about people
    who made an impact in the world that they may not know anything
    about. It is a more interactive and interesting way to learn, it is
    meant to entice the student to want to learn more about history
    itself.

2.  
<img width="297" alt="Screenshot 2024-04-05 145552" src="https://github.com/ST10439826/ST10439826StaceyBabbage/assets/160598659/a101dd60-46b5-4d5a-b02b-cbb22d696d6b">



The design is easy to follow as the included design elements were
necessary and impactful, it is simple and easy to understand and there
are minimal things on the screen. There is a good balance between being
easy to follow and still being interesting to look at, black and white
was used; simple and tasteful colors, and the buttons are purple for a
pop of color to help the app appear more interesting. The overall design
is sleek and simple, which the user will appreciate. Only necessary
interface elements were included; being the title of the app, the 2
buttons that are required for the user to use and 2 of the same images
on opposite sides of the screen to make the app more appealing to the
users as well as dynamic. Apart from the images used for aesthetics,
only essential content and functionalities are displayed. The font for
the title of the app is called “casual” to match the doodles on the
screen making it a seamlessly cohesive design and it is large and easy
for the user to see at 34sp, it is also in bold to make it stand out and
extremely easy to read. The rest of the other features such as the
‘Enter Age’ and the text views are smaller but still legible while
fitting with the overall design of the app; it is also in the same
casual font for cohesion as well as in bold to stand out against the
white background. The user will be able to see all the components of the
app everything is well spaced especially considering the design is not
too busy and cluttered, it was designed with not only aesthetics but
convenience and practicality in mind. The buttons are located closer to
the top of the screen, they are easily accessible and extremely visible
to the user, especially considering they are purple in color making them
contrast with the rest of the app. Only two images were used, the exact
same black and white doodle design, which is eye catching and appealing,
but it is not overwhelming. The app is predominantly white for
visibility reasons; The images are in those specific positions because
they are at the top and bottom of the screen locations where they do not
interfere with any of the application’s interface putting them elsewhere
would have made the hand position controls slightly more inconvenient as
well. After some trial and error putting the images at the top and
bottom of the screen ended up where they still draw the eye in a
positive way making the app look appealing without distracting from the
functions of the app or the purpose of it. The design choices are simple
but impactful, it is easy to use, and everything is extremely visible to
the user. All the design choices were carefully thought out when
creating the app.

3\.

1.  Create a New GitHub Repository:

2.  Go to the GitHub website (https://github.com/) and sign in to your
    account.

3.  Click on the "+" icon in the top right corner and select "New
    repository".

4.  Give your repository a name (your student number and name – in one
    word), add a description (use IMAD5112 Assignment 1) and choose
    public.

5.  Click on the "Create repository" button.

6.  Initialize the Repository with a README File:

7.  After creating the repository, you'll see an option to "Initialize
    this repository with a README". Check this option to create a README
    file.

8.  Click on the "Create repository" button to finalize the creation of
    the repository.

9.  3\. Commit and Push Your Project Files to the GitHub Repository:

10. In Android Studio, go to VCS (Version Control System) -> Import into
    Version Control -> Share Project on GitHub.

11. Log in to your GitHub account if prompted and select the repository
    you created earlier.

12. Click on the "Share" button to push your project files to the GitHub
    repository.

13. 4\. Regularly Commit and Push Your Code as You Make Progress:

14. After the initial push, continue making changes to your project in
    Android Studio.

15. Whenever you make significant progress or changes, commit your
    changes locally in Android Studio using VCS -> Commit Changes.

16. Once committed, push your changes to the GitHub repository using VCS
    -> Git -> Push.

**Testing and Automated Testing:**

**Conduct Manual Testing:**

Manually test your app to ensure it functions seamlessly and offers an
enjoyable educational experience for learners.

To test various features and user interactions do the following:

**1. Create a New Test Class:**

In your Android project, navigate to the tests directory (or create it
if it doesn't exist).

Create a new Kotlin file for your test class. Name it appropriately to
indicate what component or functionality you are testing.

**2. Write Test Methods:**

Inside the test class, write test methods like the example below.

3\. Use assertions to verify the expected behavior of your code.

**4. Run the Tests:**

Run the tests using the testing framework's tools provided by Android
Studio or through the command line.

Sample of a test class using JUnit:

> import org.junit.Assert.\*
>
> import org.junit.Test
>
> class WhenStatement {
>
> @Test
>
> fun testWhenStatement() {
>
> // Test case for a when statement
>
> val result = when (25) {

96 -> "Queen Elizabeth II is the former Queen of the United Kingdom of
Great Britain" +  
" and Northern Ireland. She was the longest reigning monarch and " +  
"served as Queen for 70 years. She passed away at age 96. "  
  
50 -> "Michael Jackson was an extremely successful " +  
"American musician, songwriter and dancer famously referred to as the
“King of Pop”." +  
" He passed away at age 50. "  
  
36 -> "Diana, Princess of Wales was the former wife of Charles, Prince
of Wales (currently King Charles III)." +  
" She was universally beloved and affectionately referred to as the 'The
People’s Princess'. " +  
"She passed away at age 36. "

> else -> "Nobody known to me died at this age"
>
> }
>
> assertEquals("Nobody known to me died at this age", result)
>
> }
>
> }

**GitHub Actions for Automated Testing:**

Set up GitHub Actions to automatically run tests and build your code
whenever changes are pushed to the repository.

Create a GitHub Actions workflow (.github/workflows/tests.yml) to run
tests automatically on every push:

Create a .github/workflows directory in your project repository.

Inside this directory, create YAML files defining your GitHub Actions
workflows for testing and building.

Sample GitHub Actions Workflow for Testing (tests.yml):

> name: Run Tests
>
> on: \[push\]
>
> jobs:
>
> test:
>
> runs-on: ubuntu-latest
>
> steps:
>
> \- name: Set up JDK
>
> uses: actions/setup-java@v2
>
> with:
>
> distribution: 'adopt'
>
> java-version: '11'
>
> \- name: Check out code
>
> uses: actions/checkout@v2
>
> \- name: Build and test
>
> run: ./gradlew test

Set Up Automated Build:

Create a GitHub Actions workflow (.github/workflows/build.yml) to build
the APK automatically on every push.

Sample GitHub Actions Workflow for Building (build.yml):

> name: Build APK
>
> on: \[push\]
>
> jobs:
>
> build:
>
> runs-on: ubuntu-latest
>
> steps:
>
> \- name: Set up JDK
>
> uses: actions/setup-java@v2
>
> with:
>
> distribution: 'adopt'
>
> java-version: '11'
>
> \- name: Check out code
>
> uses: actions/checkout@v2
>
> \- name: Build APK
>
> run: ./gradlew assembleDebug

Test your workflows by pushing changes to your repository and observing
the actions running in the "Actions" tab on GitHub.

**<u>Bibliography/ Reference List</u>**

Billington, M. 2023. Sir Michael Gambon obituary. The Guardian.28
September 2023. \[Online\]. Available at:
<https://www.theguardian.com/stage/2023/sep/28/michael-gambon-obituary>.
\[Accessed 04 April 2024\].

Murray, C.S.2018. Jimi Hendrix. Biography, Songs, & Facts. In:
Encyclopædia Britannica. \[Online\]. Available at:
<https://www.britannica.com/biography/Jimi-Hendrix>. \[Accessed 04 April
2024\].

Nast, C. 2021. Remembering Aaliyah, the ‘Princess of R&B’-And a
Survivor. \[Online\]. Available at:
<https://www.vogue.com/article/aaliyah-20th-anniversary-death>.
\[Accessed 04 April 2024\].

Piccotti, T. 2021. Elvis Presley - Songs, Death & Daughter. Biography.
\[Online\]. Available at:
<https://www.biography.com/musicians/elvis-presley>. \[Accessed 04 April
2024\].

Ray, M. 2019. Tupac Shakur. American rapper and actor. In: Encyclopedia
Britannica. \[Online\]. Available at:
<https://www.britannica.com/biography/Tupac-Shakur>. \[Accessed 04 April
2024\].

Rouze, M. 2018. J. Robert Oppenheimer. Biography. In: Encyclopedia
Britannica. \[Online\]. Available at:
<https://www.britannica.com/biography/J-Robert-Oppenheimer>. \[Accessed
04 April 2024\].

The Editors of Encyclopedia Britannica. 2019. Diana, Princess of Wales.
Biography, Marriage, Children, & Death. In: Encyclopedia Britannica.
\[Online\]. Available at:
<https://www.britannica.com/biography/Diana-princess-of-Wales>.
\[Accessed 04 April 2024\].

The Editors of Encyclopedia Britannica. 2019. Elizabeth II. Biography,
Family, Reign, & Facts. In: Encyclopedia Britannica. \[Online\].
Available at: <https://www.britannica.com/biography/Elizabeth-II>.
\[Accessed 04 April 2024\].

The Editors of Encyclopedia Britannica.2019. Heath Ledger. Australian
actor. In: Encyclopedia Britannica. \[Online\]. Available at:
<https://www.britannica.com/biography/Heath-Ledger>. \[Accessed on 04
April 2024\].

The IIE. 2024. Introduction to Mobile Application Development
\[IMAD5112/d/p/w Module Manual\]. The Independent Institute of
Education: Unpublished.

Vincent, R. 2019. Michael Jackson. Biography, Albums, Songs, & Facts.
In: Encyclopedia Britannica. \[Online\]. Available at:
<https://www.britannica.com/biography/Michael-Jackson>. \[Accessed 04
April 2024\].

‌

‌

