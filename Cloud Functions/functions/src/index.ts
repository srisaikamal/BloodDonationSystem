import * as functions from 'firebase-functions';

// // Start writing Firebase Functions
// // https://firebase.google.com/docs/functions/typescript

export const onBloodRequestUpdate = functions.database.ref('/receiver')
.onCreate((snapshot,context)=>{
    const original = snapshot.val();
    console.log('receiver', original);
    
})


export const helloWorld = functions.https.onRequest((request, response) => {
    console.log("Hello Firebase");
 response.send("Hello from Blood donation!");
});
