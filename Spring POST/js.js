fetch('http://localhost:8005/allrecords')
  .then(
    function(response) {
      if (response.status !== 200) {
        console.log('Looks like there was a problem. Status Code: ' +
          response.status);
        return;
      }
      // Examine the text in the response
      response.json().then(function(data) {
        console.log(data);
        for (let i =0; i<data.length;i++) {
          console.log("Registration Number: ", data[i].regno);
          console.log("Name: ", data[i].name);
          console.log("Address: ", data[i].address);
  
        //   let para = document.createElement("P"); // Create a <p> element
        //   para.className ="data alert alert-danger col-md-8";
        //   para.innerText = `
        //   ${(document.querySelector("#resp").innerHTML = data[i].id)}
        //   ${(document.querySelector("#resp").innerHTML = data[i].name)}
        //   ${(document.querySelector("#resp").innerHTML = data[i].description)}
        //   `
        // let myDiv = document.getElementById("notes");
        //   myDiv.appendChild(para);
        }
      });
    }
  )
  .catch(function(err) {
    console.log('Fetch Error :-S', err);
  });

