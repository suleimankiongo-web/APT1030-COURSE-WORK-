// Student registration checker - runs with Node.js in the terminal
// readline is how you ask questions and get typed answers back

const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

// First question: name. When they answer, we ask the second question inside the callback.
rl.question("Enter student name: ", function (studentName) {
  rl.question("Enter number of registered units: ", function (typedUnits) {
    const numUnits = parseInt(typedUnits, 10);

    let registrationStatus;
    if (numUnits > 7) {
      registrationStatus = "Overload - Approval Required";
    } else {
      registrationStatus = "Registration Accepted";
    }

    console.log("");
    console.log("--- Final Summary ---");
    console.log("Student: " + studentName);
    console.log("Units: " + numUnits);
    console.log("Status: " + registrationStatus);

    rl.close();
  });
});
