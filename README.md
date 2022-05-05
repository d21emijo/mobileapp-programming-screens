
# Rapport dugga 4 activitys, intents

- [x] Add a second activity
- [x] Add a button in the first activity that starts the second activity
- [x] Add data to the intent bundle using extras
- [x] In the layout of in the second activity add least one widget to show data from the intent

## MainActivity

i våran mainactivity så har vi en textview där användaren kan ge sin input och en knapp som skickar vidare denna input till den nya activityn.

![image](https://user-images.githubusercontent.com/102797583/166978503-75b7a726-9079-4193-a9e9-092885a70fa8.png)

```
        final TextView inlog = findViewById(R.id.login);
        //TextView user = findViewById(R.id.user);
        Button logginbutton = findViewById(R.id.logInButton);
        logginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("===","knapptryckt");
                String log = inlog.getText().toString();
                Log.d("===","knapptryckt" + log);
                Intent intent = new Intent(MainActivity.this, SecondaryActivity2.class);
                intent.putExtra("name", log);
                startActivity(intent);



            }
        });
```

det första vi gör i MainActivity är att i onCreate hittar vi vår knapp och textview med hjälp av findviewbyid, och ger dessa variablar (inlog och logginbutton).

för att ge knappen en funktion så används funktionen setOnClickListener där vi skapar en ny instans vad som ska göras när knappen klickas, först loggar vi att ett knapptryck har skett.

därefter sparar vi vad som skrivets i inlog textviewn med hjälp av gettext()tostring(). och sätter det värdet i en variabel log,
sedan skapar vi en ny intent till secondaryactivity.

för att skicka med namnet så använder vi intent.putextra där vi skickar med namnet.

det sista vi gör är att start den nya activityn.



## SecondaryActivity
i secondaryactivityn så visas den nya sidan och layouten.

![image](https://user-images.githubusercontent.com/102797583/166978523-7c47dfec-715f-4feb-9c35-87746afbd7f9.png)

```
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary2);

        TextView who = findViewById(R.id.user);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            who.setText("du heter alltså " + name);

        }

    }
```

i våran nya activity så kör vi koden i oncreate även här då vi vill få med namnet direkt.

den data som mottages här är alltså name som vi sätter i en ny variabel som också heter name.

vi stoppar därefter in name i våran textview.


