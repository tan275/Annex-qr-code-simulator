const mongoose = require('mongoose');
mongoose.connect('mongodb://localhost:27017/PeopleDB');

const fruitSchema = new mongoose.Schema({
  name:{
    type:String,
    required:[true, 'nam de benchod'],
  },
  rating:{
    type:Number,
    min:[1, 'rating should be > 1'],
    max:[10, 'max is 10']
  },
  review:String,
})

const peopleSchema = new mongoose.Schema({
  name: String,
  age: Number,
  favouriteFruit: fruitSchema,
});

const People = mongoose.model('People', peopleSchema);
const Fruit = mongoose.model('Fruit',fruitSchema);

const pineapple = new Fruit({
  name:"Pineapple",
  rating:9,
  review:"best",
})
const banana = new Fruit({
  name:"Banana",
  rating:8,
  review:"dick",
})
banana.save();
// pineapple.save();

const people = new People({
  name: 'Amy',
  age: 12,
  favouriteFruit: pineapple,
});
// people.save();

const john = new People({
  name: 'John',
  age: 37,
  favouriteFruit: banana,
});
john.save();

// People.deleteMany({name:"John"},function(err){
//   if(err){
//     console.log(err);
//   }
//   else{
//     console.log("deleted");
//   }
// });
//
// const apple = new Fruit({
//   name:"apple",
//   rating:10,
//   review:"best",
// })
//
// const peaches= new Fruit({
//   name:"peaches",
//   rating:8,
//   review:"awesome",
// })

// Fruit.insertMany([sperm,apple,peaches],function(err){
//   if(err){
//     console.log(err);
//   }
//   else{
//     console.log("success");
//   }
// })

// Fruit.find(function(err,res){
//   if(err){
//     console.log(err);
//   }
//   else{
//     res.forEach((item, i) => {
//       console.log(item.name);
//     });
//     mongoose.connection.close();
//   }
// })

// Fruit.deleteOne({_id:"63034c55d9eda323e3c96863"},function(err){
//   if(err){
//     console.log(err);
//   }
//   else{
//     console.log("deleted");
//   }
// })
