import React from "react";


interface IconProps {
  imgsrc: string;
}
const Icon = (props: IconProps) => {
  return <img src={props.imgsrc} alt='icon'></img>;
};


export default Icon;
