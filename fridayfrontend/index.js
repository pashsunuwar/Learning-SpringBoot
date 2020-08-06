 let dropdown = document.getElementById('ClientMenu')
 dropdown.length = 0;

 let defaultOption = document.createElement('option');
 defaultOption.text = 'Choose a client';

 dropdown.add(defaultOption);
 dropdown.selectedIndex = 0;

 const clientURL="http://localhost:8005/listofclients";

 fetch(clientURL)  
 .then(  
   function(response) {  
     if (response.status !== 200) {  
       console.warn('Looks like there was a problem. Status Code: ' + response.status);  
       return;  
     }

     // Examine the text in the response  
     response.json().then(function(data) {  
       console.log(data)
       let option;
       
      for (let i = 0; i<data.length; i++){
        console.log("client", data[i])
        option = document.createElement('option');
        option.text = data[i];
        dropdown.add(option);
      }
    });
  })
    .catch(function (error) {
      console.log("Request failed", error);
    });

    let e = document.getElementById("ClientMenu").value
    let strUser = e.options[e.selectedIndex].value;
    e = document.getElementById("ClientMenu");
    strUser = e.options[e.selectedIndex].text;
