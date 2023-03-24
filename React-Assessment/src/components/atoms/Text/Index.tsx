import React from "react";
import { Typography } from "@mui/material";

interface TextProps {
  content: string;
  variant:
    | "button"
    | "caption"
    | "h1"
    | "h2"
    | "h3"
    | "h4"
    | "h5"
    | "h6"
    | "inherit"
    | "subtitle1"
    | "subtitle2"
    | "body1"
    | "body2"
    | "overline"
    | undefined;
  fontwt: number;
  fontsize: string;
  color: string;
}
const Text = (props: TextProps) => {
  return (
    <Typography
      variant={props.variant}
      sx={{
        fontWeight: props.fontwt,
        fontSize: props.fontsize,
        color: props.color,
      }}
    >
      {props.content}
    </Typography>
  );
};


export default Text;
