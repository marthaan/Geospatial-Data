Question 1:
{ popularity: { $gte: 50 } }


Question 2:
See picture 


Quesiton 3:
Box lower-left location: lat = 34.02094588531017, long = -118.29002583944549
Box upper-right location: lat = 34.028505652128246, long = -118.28300593256358

{
  loc: {
     $geoWithin: {
        $box: [ 
          [ -118.29002583944549, 34.02094588531017 ],
          [ -118.28300593256358, 34.028505652128246 ]
        ]
     }
  }
}


Question 4:
See picture


Question 5:
** These points are included in the chart for clarity, but if it is desired to 
not have them shown one could fix this by just picking coordinates slightly
to the right/left/beneath the three, respectively.

Triangle bottom left point: lat = 34.0201182886601, long = -118.28603683440484
Triangle bottom right point: lat = 34.020118651118445, long = -118.28484893181663
Triangle top point: lat = 34.021189722595004, long = -118.28544696455597

{
   loc: {
      $geoWithin: {
         $geometry: {
            type: "Polygon",
            coordinates: [ [
                [-118.28544696455597, 34.021189722595004], 
                [-118.28603683440484, 34.0201182886601], 
                [-118.28484893181663, 34.020118651118445], 
                [-118.28544696455597, 34.021189722595004]
            ] ]
         }
      }
   }
}


Question 6:
While more locations could have been included, I was trying to be as accurate
as possible, and found 119 locations to the west of the Rockies. 

Upper-left location:
Latitude: 68.09280652513834
Longitude: -161.1594590060686

Lower-right location:
Latitude: 32.15234275399143
Longitude: -104.52776563457927

{
  geometry: {
    $geoWithin: {
      $box: [
        [ -104.52776563457927, 32.15234275399143 ],
        [ -161.1594590060686, 68.09280652513834 ]
      ]
    }
  }
}

