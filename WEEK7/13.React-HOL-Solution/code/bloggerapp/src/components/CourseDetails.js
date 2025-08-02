import React from 'react';

const CourseDetails = ({ courses }) => {
  return (
    <div>
      {courses.map((course, index) => (
        <div key={index}>
          <h2>{course.cname}</h2>
          <p>{course.date}</p>
        </div>
      ))}
    </div>
  );
};

export default CourseDetails;
