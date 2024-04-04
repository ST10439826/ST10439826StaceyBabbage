package za.vcconnect.thehistoryappST10439826

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val compareButton = findViewById<Button>(R.id.compareButton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val ageEditText = findViewById<EditText>(R.id.ageEditText)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        //add code to the button when it is clicked
        compareButton.setOnClickListener {

            //assign the text in the ageEditText to variable userInput
            val userInput = ageEditText.text.toString()

            //check if the user typed in an age
            if (userInput.isEmpty()) {
                resultTextView.text ="Please enter a valid age - it must be a whole number without any decimals or text."
            }

            // check if the age is a valid integer
            //store age in a variable
            val userAge = userInput.toIntOrNull()

            //check if the age is not a valid integer
            if (userAge == null) {
                resultTextView.text =
                    "Please enter a valid age - it must be a whole number without any decimals or text."
            } else {

                // check if the age is in the correct range
                if (userAge < 20 || userAge > 100) {
                    resultTextView.text = "Please enter an age between 20 and 100."
                    ageEditText.text.clear()
                } else {

                    //use when to check for age
                    val result = when (userAge) {
                        96 -> "Queen Elizabeth II is the former Queen of the United Kingdom of Great Britain" +
                                " and Northern Ireland. She was the longest reigning monarch and " +
                                "served as Queen for 70 years. She passed away at age 96. "

                        50 -> "Michael Jackson was an extremely successful " +
                                "American musician, songwriter and dancer famously referred to as the “King of Pop”." +
                                " He passed away at age 50. "

                        36 -> "Diana, Princess of Wales was the former wife of Charles, Prince of Wales (currently King Charles III)." +
                                " She was universally beloved and affectionately referred to as the 'The People’s Princess'. " +
                                "She passed away at age 36. "

                        22 -> "Aaliyah Haughton, most known as “Aaliyah” was a singer, dancer, actor, and model. " +
                                "She was an extremely gifted child singer and became a popular R&B singer before her death. " +
                                "She passed away at age 22. "

                        42 -> "Elvis Presley was an iconic rock n roll musician in the 1950’s, commonly referred" +
                                " to as “The King of Rock n Roll”. He passed away at age 42. "

                        25 -> "Tupac Shakur was an American rapper and actor in the 1990’s, " +
                                "he was one of the top selling artists of all time. He passed away at age 25. "

                        62 -> "J. Robert Oppenheimer was an American Theoretical Physicist that was attributed to" +
                                " the creation of the atomic bomb. He passed away at age 62. "

                        28 -> "Heath Ledger was an Australian actor, famous for playing the Joker " +
                                "in the Batman trilogy. He passed away at age 28. "

                        27 -> "Jimi Hendrix was an American rock musician, songwriter, and guitarist." +
                                " Many regarded him as 'arguably the greatest instrumentalist in the history of rock music.'" +
                                " He passed away at age 27. "

                        82 -> "Sir Michael Gambon was an Irish film and theatre actor, most famous for his role as Albus Dumbledore " +
                                "in the Harry Potter franchise. He passed away at age 82"

                        else -> "Nobody known to me died at this age."
                    }
                    //show output to user
                    resultTextView.text = result

        //clear out the resultTextView and the ageEditText on the Clear button click
        clearButton.setOnClickListener {
            ageEditText.text.clear()
            resultTextView.text = ""
        }
                    }
                }
            }

        }
    }


